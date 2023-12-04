/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

/**
 *
 * @author admin
 */
public class Experience extends Candidate{
    private int explnYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, int explnYear, String proSkill ) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
}
