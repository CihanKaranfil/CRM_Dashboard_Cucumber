package stepDefination.Admin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Admin.Sirketler_Pages;
import utilities.ReusableMethods;

public class SirkelerStepdefs extends ReusableMethods {

    Sirketler_Pages sirketveKisiler = new Sirketler_Pages();
    Faker faker = new Faker();

    @Then("Kullanici Sirketler ve Kisilere tıklar")
    public void kullaniciSirketlerVeKisilereTıklar() {

        sirketveKisiler.sirketveKisiler.click();

    }

    @And("Kullanici Sirketlere tıklar")
    public void kullaniciSirketlereTıklar() throws InterruptedException {
        sirketveKisiler.sirketler.click();
        Thread.sleep(1500);
    }

    @And("Kullanici Yeni Sirket ekle butonuna tıklar")
    public void kullaniciYeniSirketEkleButonunaTıklar() {
        sirketveKisiler.yeniSirket.click();
    }


    @Then("Kullanici Sirket bilgilerini girer")
    public void kullaniciSirketBilgileriniGirer() throws InterruptedException {
        sirketveKisiler.sirketAdi2.click();

        sirketveKisiler.sirketAdi2.sendKeys(faker.name().name() + "(TEST)",
                Keys.TAB, faker.phoneNumber().phoneNumber(), Keys.TAB, "M");
        Thread.sleep(500);

        // web sitesi, sektör, segment  ekleme

        sirketveKisiler.webSitesi.sendKeys("https://" + faker.internet().url(), Keys.TAB, "Giyim", Keys.TAB, "Segment1",
                Keys.TAB, "n");

        sirketveKisiler.ticariUnvan.sendKeys("Ticari Unvan", Keys.TAB, "Battalgazi", Keys.TAB, faker.number().digits(5));
        //ülke, sehir, ilce, adres, posta kodu, e mail ekleme
        sirketveKisiler.ulke.sendKeys("Türkiye", Keys.TAB, "Malatya", Keys.TAB, "Battalgazi", Keys.TAB,
                "Adres", Keys.TAB, "44170", Keys.TAB, faker.internet().emailAddress());
    }

    @And("Kullanici Kaydet butonuna tıklar")
    public void kullaniciKaydetButonunaTıklar() throws InterruptedException {
        sirketveKisiler.kaydetButton.click();
        Thread.sleep(1500);
    }

    @And("Kullanici ekledigi sirketi siler")
    public void kullaniciEkledigiSirketiSiler() throws InterruptedException {

        try {
            sirketveKisiler.sirketlerList.getLast().click();
        } catch (Exception e) {
            click(sirketveKisiler.sirketlerList.getLast());
        }

        Thread.sleep(1500);
        click(sirketveKisiler.silButton);
        Thread.sleep(1000);

        try {
            sirketveKisiler.silButton4.click();
        } catch (Exception e) {
            click(sirketveKisiler.silButton3);
        }
    }
}
