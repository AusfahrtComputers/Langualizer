import java.util.ArrayList;

public class gebruiker {
    String name = "John";
    String gebruikersnaam = "";
    String wachtwoord = "";
    Boolean niveau = true;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public Boolean getNiveau() {
        return niveau;
    }

    public void setNiveau(Boolean niveau) {
        this.niveau = niveau;
    }
}
