package pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.generator;

import pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.NapedzanyStatekPowietrzny;
import pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.Spadochron;
import pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.StatekPowietrzny;
import pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.Szybowiec;

import java.util.List;
import java.util.Map;
import java.util.Set;


public interface Strumienie {

    StatekPowietrzny getNajciezszyStatekPowietrzny();
    StatekPowietrzny getNajszybszySamolot();
    StatekPowietrzny getSmiglowiecONajmniejszymZasiegu();
    Set<StatekPowietrzny> getSamolotyWzbijajaceSieSzybciejNiz130();
    public List<NapedzanyStatekPowietrzny> get4NajwolniewznoszaceSieSmiglowce();
    Spadochron getNiesiedzeniowySpadochron();
    Map<Integer, Szybowiec> getMapaSzybowcowPerDoskonalosc();
    int getSumePredkosciSamolotow();
    Map<String, StatekPowietrzny> getPosortowaneSmigowceLubSamoloty();
    List<String> zwrocPosortowaneNazwy();
    void modyfikujNazwy();

}
