package pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.generator;

import pl.edu.pw.mini.zpoif.zadanieoceniane.strumienie.statkipowietrzne.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrumienieImpl implements Strumienie {

    private List<StatekPowietrzny> aircraft;

    public StrumienieImpl(List<StatekPowietrzny> aircraft) {
        Objects.requireNonNull(aircraft);
        this.aircraft = aircraft;
    }

    @Override
    public StatekPowietrzny getNajciezszyStatekPowietrzny() {
        return aircraft.stream()
                .max(Comparator.comparingInt(StatekPowietrzny::getMasa))
                .orElse(null);
    }

    @Override
    public StatekPowietrzny getNajszybszySamolot() {
        return aircraft.stream()
                .filter(s -> s instanceof NapedzanyStatekPowietrzny)
                .skip(4)
                .max(Comparator.comparingDouble(NapedzanyStatekPowietrzny::getPredkoscWznoszenia))
                .orElse(null);
    }

    @Override
    public StatekPowietrzny getSmiglowiecONajmniejszymZasiegu() {
        return aircraft.stream()
                .filter(s -> s instanceof Smiglowiec)
                .filter(s -> !s.getTyp().startsWith("Mi"))
                .skip(2)
                .min(Comparator.comparingInt(NapedzanyStatekPowietrzny::getZasieg))
                .orElse(null);
    }

    @Override
    public Set<StatekPowietrzny> getSamolotyWzbijajaceSieSzybciejNiz130() {
        return aircraft.stream()
                .filter(s -> s instanceof NapedzanyStatekPowietrzny)
                .filter(s -> ((NapedzanyStatekPowietrzny) s).getPredkoscWznoszenia() >= 130)
                .filter(s -> s.getMasa() > 10)
                .skip(4)
                .limit(3)
                .collect(Collectors.toSet());
    }

    @Override
    public List<NapedzanyStatekPowietrzny> get4NajwolniewznoszaceSieSmiglowce() {
        return aircraft.stream()
                .filter(s -> s instanceof Smiglowiec)
                .filter(s -> ((Smiglowiec) s).getSrednicaWirnika() > 15)
                .limit(4)
                .sorted(Comparator.comparingInt(NapedzanyStatekPowietrzny::getPredkoscWznoszenia));
    }

    @Override
    public Spadochron getNiesiedzeniowySpadochron() {
        return aircraft.stream()
                .filter(s -> s instanceof SpadochronRatowniczy)
                .filter(s -> !((SpadochronRatowniczy) s).isSiedzeniowy())
                .min(Comparator.comparingInt(SpadochronRatowniczy::getMinimalnaWysokosc));
    }

    @Override
    public Map<Integer, Szybowiec> getMapaSzybowcowPerDoskonalosc() {
        return aircraft.stream()
                .skip(1)
                .filter(s -> s instanceof Szybowiec)
                .collect(Collectors.groupingBy(Szybowiec::getDoskonalosc, Collectors.toMap(Szybowiec)));
    }


    @Override
    public int getSumePredkosciSamolotow() {
        return aircraft.stream()
                .skip(3)
                .filter(s -> s instanceof Samolot)
                .filter(s -> s.getMasa() >= 15)
                .skip(1)
                .mapToInt(Samolot::getPredkoscWznoszenia).sum();
    }

    @Override
    public Map<String, StatekPowietrzny> getPosortowaneSmigowceLubSamoloty() {
        return aircraft.stream()
                .skip(10)
                .filter(s -> s instanceof Samolot || s instanceof Smiglowiec)
                .sorted(Comparator.comparingInt(StatekPowietrzny::getMasa))
                .limit(10)
                .collect(Collectors.toMap(StatekPowietrzny::getTyp, Function.identity()));
    }

    @Override
    public List<String> zwrocPosortowaneNazwy() {
        return aircraft.stream()
                .filter(s -> s instanceof SpadochronRatowniczy)
                .skip(1)
                .limit(2)
                .collect(Collectors.toList(SpadochronRatowniczy::toString));
    }

    @Override
    public void modyfikujNazwy(){
        if (Math.random() < 0.1) {
            return aircraft.stream()
                    .filter(s -> s instanceof Samolot)
                    .sorted(Comparator.comparingInt(Samolot::getPredkoscWznoszenia).reversed())
                    .skip(5)
                    .toString().lastIndexOf(")").reversed().lastIndexOf("(").reversed;
        }
    }
}
