package com.siteadi;



import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="yb")
@RequestScoped
public class YonetimliBean implements Serializable{

   
	private static final long serialVersionUID = 1L;
//Personel s�n�f�n�n tipinde personellistesi ad�nda bir dizi olu�turulur ve i�i burada doldurulur.	
	public static final Personel[] personelListesi=new Personel[]{
        new Personel("571","Vahit celik",new BigDecimal("1900.00"),24),
        new Personel("581","tansu celik",new BigDecimal("1700.00"),28),
        new Personel("591","muharrem celik",new BigDecimal("1600.00"),23),
        new Personel("501","kemal celik",new BigDecimal("1500.00"),18),
    };
    
	//i�i doldurulan dizi personel s�n�f�n�n tipinde getpersonellistesi ad�nda olu�turulan metodla �ekilir.
    public Personel[] getPersonelListesi(){
        return personelListesi;
    }
   
    
}
