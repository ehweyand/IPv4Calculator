package utils;

import java.util.HashMap;

/**
 *
 * @author Evandro Henrique Weyand
 */
public class IPCalculator {

    private HashMap<String, String[]> masks;

    private String ip;
    private String maskBits;
    private String subnetMask;
    private String wildCardMask;

    public IPCalculator(String ip, String maskBits) {
        this.ip = ip;
        this.maskBits = maskBits;
        // Remover barra se foi inserida
        this.maskBits = this.maskBits.replace("/", "");
        this.masks = new HashMap();
        
        // Adicionando as máscaras
        masks.put("32", new String[]{"255.255.255.255", "0.0.0.0"});
        masks.put("31", new String[]{"255.255.255.254", "0.0.0.1"});
        masks.put("30", new String[]{"255.255.255.252", "0.0.0.3"});
        masks.put("29", new String[]{"255.255.255.248", "0.0.0.7"});
        masks.put("28", new String[]{"255.255.255.240", "0.0.0.15"});
        masks.put("27", new String[]{"255.255.255.224", "0.0.0.31"});
        masks.put("26", new String[]{"255.255.255.192", "0.0.0.63"});
        masks.put("25", new String[]{"255.255.255.128", "0.0.0.127"});
        masks.put("24", new String[]{"255.255.255.0", "0.0.0.255"});
        masks.put("23", new String[]{"255.255.254.0", "0.0.1.255"});
        masks.put("22", new String[]{"255.255.252.0", "0.0.3.255"});
        masks.put("21", new String[]{"255.255.248.0", "0.0.7.255"});
        masks.put("20", new String[]{"255.255.240.0", "0.0.15.255"});
        masks.put("19", new String[]{"255.255.224.0", "0.0.31.255"});
        masks.put("18", new String[]{"255.255.192.0", "0.0.63.255"});
        masks.put("17", new String[]{"255.255.128.0", "0.0.127.255"});
        masks.put("16", new String[]{"255.255.0.0", "0.0.255.255"});
        masks.put("15", new String[]{"255.254.0.0", "0.1.255.255"});
        masks.put("14", new String[]{"255.252.0.0", "0.3.255.255"});
        masks.put("13", new String[]{"255.248.0.0", "0.7.255.255"});
        masks.put("12", new String[]{"255.240.0.0", "0.15.255.255"});
        masks.put("11", new String[]{"255.224.0.0", "0.31.255.255"});
        masks.put("10", new String[]{"255.192.0.0", "0.63.255.255"});
        masks.put("9", new String[]{"255.128.0.0", "0.127.255.255"});
        masks.put("8", new String[]{"255.0.0.0", "0.255.255.255"});
        masks.put("7", new String[]{"254.0.0.0", "1.255.255.255"});
        masks.put("6", new String[]{"252.0.0.0", "3.255.255.255"});
        masks.put("5", new String[]{"248.0.0.0", "7.255.255.255"});
        masks.put("4", new String[]{"240.0.0.0", "15.255.255.255"});
        masks.put("3", new String[]{"224.0.0.0", "31.255.255.255"});
        masks.put("2", new String[]{"192.0.0.0", "63.255.255.255"});
        masks.put("1", new String[]{"128.0.0.0", "127.255.255.255"});
        
        // Armazenando a wildcard correta
        this.wildCardMask = masks.get(this.maskBits)[1];

    }

    public String getSubnetMask() {
        return masks.get(this.maskBits)[0];
    }

    public String getWildCardMask() {
        return this.wildCardMask;
    }

}
