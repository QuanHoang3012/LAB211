/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Controller {

    private List<Candidate> listCandidate = new ArrayList<>();

    public List<Candidate> getCandidateById(String id) {
        List<Candidate> result = new ArrayList<>();
        for (Candidate candidate : listCandidate) {
            if (id.equalsIgnoreCase(candidate.getCandidateId())) {
                result.add(candidate);
            }
        }
        return result;
    }
    
    public boolean checkIdExist(String id) {
        for (Candidate candidate : listCandidate) {
            if (candidate.getCandidateId().equalsIgnoreCase(id)) {
                System.out.println("Id exist.");
                return false;
            }
        }
        return true;
    }

    public List<Candidate> getCandidate() {
        return listCandidate;
    }
    
    public boolean addExperience(String id, String fitsrName, String lastName, int birthDay, String address, String phone, String email, int candidateType, int explnYear, String proSkill){
        List<Candidate> duplicate = getCandidateById(id);
        if(duplicate.size()>0){
            return false;
        }
        listCandidate.add(new Experience(id, fitsrName, lastName, birthDay, address, phone, email, candidateType, explnYear, proSkill));
        return true;
    }
    public boolean addFresher(String id, String fitsrName, String lastName, int birthDay, String address, String phone, String email, int candidateType, int graduationDate, String graduationRank, String Education){
        List<Candidate> duplicate = getCandidateById(id);
        if(duplicate.size()>0){
            return false;
        }
        listCandidate.add(new Fresher(id, fitsrName, lastName, birthDay, address, phone, email, candidateType, graduationDate, graduationRank, Education));
        return true;
    }
    public boolean addIntern(String id, String fitsrName, String lastName, int birthDay, String address, String phone, String email, int candidateType, String majors, int semester, String universityName){
        List<Candidate> duplicate = getCandidateById(id);
        if(duplicate.size()>0){
            return false;
        }
        listCandidate.add(new Intern(id, fitsrName, lastName, birthDay, address, phone, email, candidateType, majors, semester, universityName));
        return true;
    }

}
