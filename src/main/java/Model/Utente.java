package Model;
import java.util.ArrayList;
import java.util.Date;

public class Utente {

    private String nome;
    private String cognome;
    private String email;
    private String username;
    private String password;
    Date dataReg;
    private int codGalleria;
    private GalleriaPersonale galleriaPersonale;
    private ArrayList<Foto> photos;
    private ArrayList<GalleriaCondivisa> gallerieCondivise;
    private ArrayList<Dispositivo> dispositivi;

    public Utente (String name, String surname, String user, String pass, String email1, Date d){
        this.username=user;
        this.password=pass;
        this.dataReg=d;
        this.nome=name;
        this.cognome=surname;
        this.email=email1;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDataReg() {
        return dataReg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCodGalleria() {
        return codGalleria;
    }
    public void setCodGalleria(int codGalleria) {
        this.codGalleria = codGalleria;
    }
    public ArrayList<Foto> getPhotos() {
        return photos;
    }
    public void setPhotos(ArrayList<Foto> photos) {
        this.photos = photos;
    }
    public ArrayList<GalleriaCondivisa> getGallerieCondivise() {
        return gallerieCondivise;
    }
    public void setGallerieCondivise(ArrayList<GalleriaCondivisa> gallerieCondivise) {
        this.gallerieCondivise = gallerieCondivise;
    }
    public ArrayList<Dispositivo> getDispositivi() {
        return dispositivi;
    }
    public void setDispositivi(ArrayList<Dispositivo> dispositivi) {
        this.dispositivi = dispositivi;
    }
    public void addDispositivo(Dispositivo d){
        this.dispositivi.add(d);
    }
    public void removeDispositivo(Dispositivo d){
        this.dispositivi.remove(d);
    }
    public GalleriaPersonale getGalleriaPersonale() {
        return galleriaPersonale;
    }
    public void setGalleriaPersonale(GalleriaPersonale galleriaPersonale) {
        this.galleriaPersonale = galleriaPersonale;
    }
    public void addGalleriaCondivisa(GalleriaCondivisa g){
        this.gallerieCondivise.add(g);
    }


}