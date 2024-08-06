package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SirketveKisiler_Pages {

    public SirketveKisiler_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[3]/div[1]/div[1]/div") public WebElement sirketveKisiler ;
    @FindBy(xpath = "//*[@id=\"radix-:rh:\"]/ul/li[1]/a/div/span") public WebElement sirketler ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniSirket ;
    @FindBy(xpath = "//*[@id=\"radix-:r1c:\"]/div[2]/div[1]/div[1]/div/input") public WebElement sirketAdi ;


}
