/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import Dominio.Chapters;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface InterfazChapters {
    public List<Chapters> findAllChapters();
    public Chapters findChaptersByID(Chapters chapters);
    public Chapters findChaptersByName(Chapters chapters);
    public void insert(Chapters chapters);
    public void updateChapters(Chapters chapters);
    public void deleteChapters(Chapters chapters);
}
