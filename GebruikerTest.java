import org.junit.Assert;
import org.junit.Test;

public class GebruikerTest {

    @Test
    public void testGebruikersnaamLengte() {
        gebruiker gebruiker = new gebruiker();
        String teLangeGebruikersnaam = "DitIsEenTeLangeGebruikersnaamDieMeerDan50TekensBevat";

        gebruiker.setGebruikersnaam(teLangeGebruikersnaam);
        String resultaat = gebruiker.getGebruikersnaam();

        Assert.assertTrue("Gebruikersnaam mag niet langer zijn dan 50 tekens", resultaat.length() <= 50);
    }

    @Test
    public void testWachtwoordLengte() {
        gebruiker gebruiker = new gebruiker();
        String teLangWachtwoord = "DitIsEenTeLangWachtwoordDatMeerDan50TekensBevat";

        gebruiker.setWachtwoord(teLangWachtwoord);
        String resultaat = gebruiker.getWachtwoord();

        Assert.assertTrue("Wachtwoord mag niet langer zijn dan 50 tekens", resultaat.length() <= 50);
    }
}
