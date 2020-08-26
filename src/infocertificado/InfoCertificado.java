/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infocertificado;

/**
 *
 * @author geova
 */
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.security.KeyStore;  
import java.security.Provider;  
import java.security.cert.CertificateParsingException;  
import java.security.cert.X509Certificate;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Collection;  
import java.util.Enumeration;  
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
  
import org.bouncycastle.asn1.DERObject;  
import org.bouncycastle.asn1.DERObjectIdentifier;  
import org.bouncycastle.asn1.DEROctetString;  
import org.bouncycastle.asn1.DERPrintableString;  
import org.bouncycastle.asn1.DERSequence;  
import org.bouncycastle.asn1.DERTaggedObject;  
import org.bouncycastle.asn1.DERUTF8String;  
import org.bouncycastle.x509.extension.X509ExtensionUtil;  
  
public class InfoCertificado {  
         
      
    public static void main(String[] args) {  
          
        try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (UnsupportedLookAndFeelException e) {
         
        System.out.println("Erro: " + e.getMessage());
        e.printStackTrace();
         
    } catch (ClassNotFoundException e) {
         
        System.out.println("Erro: " + e.getMessage());
        e.printStackTrace();
         
    } catch (InstantiationException e) {
         
        System.out.println("Erro: " + e.getMessage());
        e.printStackTrace();
         
    } catch (IllegalAccessException e) {
         
        System.out.println("Erro: " + e.getMessage());
        e.printStackTrace();
    }
        
         principal pp = new principal();
         pp.setVisible(true);
    }  
  
      
      
}  
