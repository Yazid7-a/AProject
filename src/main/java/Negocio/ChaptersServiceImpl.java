/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Chapters;
import datos.ChaptersDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class ChaptersServiceImpl implements ChaptersService{

    @Inject  
    private ChaptersDao InterfazChapters;
    
    @Override
    public List<Chapters> findAllChapters() {
        return InterfazChapters.findAllChapters();
    }

    @Override
    public Chapters findChaptersByID(Chapters chapters) {
        return InterfazChapters.findChaptersByID(chapters);
    }

    @Override
    public Chapters findChaptersByName(Chapters chapters) {
        return InterfazChapters.findChaptersByName(chapters);
    }

    @Override
    public void insert(Chapters chapters) {
        InterfazChapters.insert(chapters);
    }

    @Override
    public void updateChapters(Chapters chapters) {
        InterfazChapters.updateChapters(chapters);
    }

    @Override
    public void deleteChapters(Chapters chapters) {
        InterfazChapters.deleteChapters(chapters);
    }
    
}
