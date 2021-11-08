package ipv4calculator;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import view.MainFrame;

/**
 *
 * @author Evandro Henrique Weyand
 */
public class IPV4Calculator {

    public static void main(String[] args) {

        // Definindo o look and feel:
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                // Not found
            }
        }

        new MainFrame().setVisible(true);

//        IPCalculator c = new IPCalculator("192.168.254.254", 24);
//        // Testes:
//        System.out.println("Endereço IP: " + c.getIPAddressBinary());
//        System.out.println("Máscara de Subrede: " + c.getSubnetMaskBinary());
//        System.out.println("Net ID: " + c.getNetworkIDAddressBinary());
//        System.out.println("Broadcast: " + c.getBroadcastAddressBinary());
//        System.out.println("------------------------------------------------");
//        System.out.println("Endereço IP: " + c.getIPAddress());
//        System.out.println("Máscara de Subrede: " + c.getSubnetMask());
//        System.out.println("Net ID: " + c.getNetworkIDAddress());
//        System.out.println("Broadcast: " + c.getBroadcastAddress());
//        System.out.println("------------------------------------------------");
//        System.out.println("Hosts disponíveis: " + c.getNumberOfHostsAvailable());
//        System.out.println("Redes disponíveis: " + c.getNumberOfNetworksAvailable());
    }

}
