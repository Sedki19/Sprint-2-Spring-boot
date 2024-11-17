package com.sedki.pcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sedki.pcs.entities.Marque;
import com.sedki.pcs.entities.Pc;
import com.sedki.pcs.repos.PcRepository;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    PcRepository pcRepository;

    @Override
    public Pc savePc(Pc p) {
        return pcRepository.save(p);
    }

    @Override
    public Pc updatePc(Pc p) {
        return pcRepository.save(p);
    }

    @Override
    public void deletePc(Pc p) {
        pcRepository.delete(p);
    }

    @Override
    public void deletePcById(Long id) {
        pcRepository.deleteById(id);
    }

    @Override
    public Pc getPc(Long id) {
        return pcRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pc> getAllPcs() {
        return pcRepository.findAll();
    }

    @Override
    public List<Pc> findByNomPc(String nom) {
        return pcRepository.findByNomPc(nom);
    }

    @Override
    public List<Pc> findByNomPcContains(String nom) {
        return pcRepository.findByNomPcContains(nom);
    }

    @Override
    public List<Pc> findByNomPrix(String nom, Double prix) {
        return pcRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Pc> findByMarque(Marque marque) {
        return pcRepository.findByMarque(marque);
    }

    @Override
    public List<Pc> findByMarqueIdMarq(Long id) {
        return pcRepository.findByMarqueIdMarq(id);
    }

    @Override
    public List<Pc> findByOrderByNomPcAsc() {
        return pcRepository.findByOrderByNomPcAsc();
    }

    @Override
    public List<Pc> trierPcsNomsPrix() {
        return pcRepository.trierPcsNomsPrix();
    }
}
