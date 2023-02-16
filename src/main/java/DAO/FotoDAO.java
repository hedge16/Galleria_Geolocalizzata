package DAO;

import Model.Foto;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public interface FotoDAO {

    ArrayList<Foto> recuperaFotoDB (String username) throws SQLException;
    int inserisciFotoDB (boolean privata, boolean rimossa, Date dataScatto, int codgalleriap, String autore, int codDispositivo, String percorsoFoto) throws SQLException, FileNotFoundException;
    void eliminaFotoDB (int codFoto) throws SQLException;
    Foto getLastFoto (String username) throws SQLException;
    void setPrivacyDB (int codfoto, boolean state) throws SQLException;
    ArrayList<Foto> ricercaFotoPerLuogo (String nomeLuogo) throws SQLException;
    ArrayList<Foto> ricercaFotoPerSoggetto (String categoria, String nome) throws SQLException;
}
