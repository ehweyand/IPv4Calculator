package utils;

import java.util.HashMap;

/**
 *
 * @author Evandro Henrique Weyand
 *
 * Instructions to use: Instantiate a object of this class, setting the IP. The
 * class will convert the ip and his elements with various available methods.
 */
public class IPCalculator {

    // Input data
    private String ip;
    private int maskBits;

    // Control data
    private int ipBin;
    private int maskBin;
    private int netBin;
    private int bcBin;
    private String[] printMaskBin;
    private String[] printNetBin;
    private String[] printBcBin;

    public IPCalculator(String ip, int maskBits) {
        this.ip = ip;
        this.maskBits = maskBits;
        init();
    }

    /*
    * Start the ADT (Abstract Data type).
     */
    private void init() {
        String[] parts = this.ip.trim().split("\\.");

        String bq1 = Integer.toBinaryString(Integer.parseInt(parts[0]));
        String bq2 = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String bq3 = Integer.toBinaryString(Integer.parseInt(parts[2]));
        String bq4 = Integer.toBinaryString(Integer.parseInt(parts[3]));

        // Transforma em strings de 8 digitos
        String ipByte1 = String.format("%08d", Integer.parseInt(bq1));
        String ipByte2 = String.format("%08d", Integer.parseInt(bq2));
        String ipByte3 = String.format("%08d", Integer.parseInt(bq3));
        String ipByte4 = String.format("%08d", Integer.parseInt(bq4));

        this.ipBin = Integer.parseInt(ipByte1 + ipByte2 + ipByte3, 2);
        // Contornando o limite de 31 bit unsigned int do java
        this.ipBin = (ipBin << 8) + Integer.parseInt(ipByte4, 2);

        this.maskBin = ~0 << (32 - this.maskBits);
        this.netBin = this.ipBin & this.maskBin;
        this.bcBin = this.ipBin | ~this.maskBin;
    }

    /*
    * DECIMAL
     */
    public String getBroadcastAddress() {
        return String.valueOf(Integer.parseInt(printBcBin[0], 2)) + "."
                + String.valueOf(Integer.parseInt(printBcBin[1], 2)) + "."
                + String.valueOf(Integer.parseInt(printBcBin[2], 2)) + "."
                + String.valueOf(Integer.parseInt(printBcBin[3], 2));
    }

    public String getNetworkIDAddress() {
        return String.valueOf(Integer.parseInt(printNetBin[0], 2)) + "."
                + String.valueOf(Integer.parseInt(printNetBin[1], 2)) + "."
                + String.valueOf(Integer.parseInt(printNetBin[2], 2)) + "."
                + String.valueOf(Integer.parseInt(printNetBin[3], 2));
    }

    public String getSubnetMask() {
        return String.valueOf(Integer.parseInt(printMaskBin[0], 2)) + "."
                + String.valueOf(Integer.parseInt(printMaskBin[1], 2)) + "."
                + String.valueOf(Integer.parseInt(printMaskBin[2], 2)) + "."
                + String.valueOf(Integer.parseInt(printMaskBin[3], 2));
    }

    public String getIPAddress() {
        return this.ip;
    }

    /*
    * BINARY
     */
    public String getBroadcastAddressBinary() {
        String strBcBin = Integer.toBinaryString(this.bcBin);
        strBcBin = String.format("%32s", strBcBin).replace(" ", "0");
        printBcBin = strBcBin.split("(?<=\\G........)");

        return printBcBin[0] + "." + printBcBin[1] + "." + printBcBin[2] + "." + printBcBin[3];
    }

    public String getNetworkIDAddressBinary() {
        String strNetBin = Integer.toBinaryString(netBin);
        strNetBin = String.format("%32s", strNetBin).replace(" ", "0");
        printNetBin = strNetBin.split("(?<=\\G........)");

        return printNetBin[0] + "." + printNetBin[1] + "." + printNetBin[2] + "." + printNetBin[3];
    }

    public String getSubnetMaskBinary() {
        String strMaskBin = Integer.toBinaryString(maskBin);
        strMaskBin = String.format("%32s", strMaskBin).replace(" ", "0");
        this.printMaskBin = strMaskBin.split("(?<=\\G........)");

        return printMaskBin[0] + "." + printMaskBin[1] + "." + printMaskBin[2] + "." + printMaskBin[3];
    }

    public String getIPAddressBinary() {
        String strIpBin = Integer.toBinaryString(this.ipBin);
        strIpBin = String.format("%32s", strIpBin).replace(" ", "0");
        String[] printIpBin = strIpBin.split("(?<=\\G........)");

        return printIpBin[0] + "." + printIpBin[1] + "." + printIpBin[2] + "." + printIpBin[3];
    }

    /*
    * OTHERS
     */
    public int getNumberOfHostsAvailable() {
        return Integer.parseInt(String.valueOf(~maskBin - 1));
    }

    public int getNumberOfNetworksAvailable() {
        return Integer.parseInt(String.valueOf(~(~0 << this.maskBits) + 1));
    }

}
