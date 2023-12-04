package lab22;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Manager {

    Validation v = new Validation();
    Controller c = new Controller();

    public void createCandidate(int type) {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Enter id: ");
            String id = v.checkString();
            System.out.println("Enter first name: ");
            String firstName = v.checkString();
            System.out.println("Enter last name: ");
            String lastName = v.checkString();
            int birthDate = v.checkInputIntLimit("Enter Birth date: ", 1900, 2023);
            System.out.println("Enter address: ");
            String address = v.checkString();
            System.out.println("Enter phone number: ");
            String phone = v.checkString();
            System.out.println("Enter email: ");
            String email = v.checkInputEmail();
            if (c.checkIdExist(id)) {
                Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
                switch (type) {
                    case 0:
                        createExperience(candidate);
                        break;
                    case 1:
                        createFresher(candidate);
                        break;
                    case 2:
                        createInternship(candidate);
                        break;
                    default:
                        System.out.println("Invalid candidate type.");
                        break;
                }
                isContinue = false; // Exit the loop after creating a candidate
            } else {
                System.out.println("ID already exists. Enter a different ID.");
            }
        }
    }

    public void createExperience(Candidate candidate) {
        int explnYear = v.checkInputIntLimit("Enter years of experience: ", 0, 2023 - candidate.getBirthDate());
        System.out.println("Enter pro skill: ");
        String proSkill = v.checkString();
        c.addExperience(candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(), explnYear, proSkill);
    }

    public void createFresher(Candidate candidate) {
        int graduatedTime = v.checkInputIntLimit("Enter graduated time: ", candidate.getBirthDate() + 18, 2023);
        System.out.println("Enter rank of graduation: ");
        String graduatedRank = v.checkString();
        System.out.println("Enter education: ");
        String education = v.checkString();
        c.addFresher(candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(), graduatedTime, graduatedRank, education);
    }

    public void createInternship(Candidate candidate) {
        System.out.println("Enter majors: ");
        String major = v.checkString();
        int semester = v.checkInputIntLimit("Enter semester: ", 0, Integer.MAX_VALUE);
        System.out.println("Enter university name: ");
        String uniName = v.checkString();
        c.addIntern(candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(), major, semester, uniName);
    }

    public void searching() {
        printListNameCandidates();
        System.out.print("Enter candidate name (First name or Last name): ");
        String nameSearch = v.checkString();
        int typeCandidate = v.checkInputIntLimit("Enter type of candidate: ", 0, 2);
        for (Candidate candidate : c.getCandidate()) {
            if (candidate.getCandidateType() == typeCandidate
                    && (candidate.getFirstName().toLowerCase().contains(nameSearch.toLowerCase()) || candidate.getLastName().toLowerCase().contains(nameSearch.toLowerCase()))) {
                System.out.println(candidate.toString());
            }
        }

    }

    public void printListNameCandidates() {
        System.out.println("Experience Candidates:");
        for (Candidate candidate : c.getCandidate()) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("Fresher Candidates:");
        for (Candidate candidate : c.getCandidate()) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("Internship Candidates:");
        for (Candidate candidate : c.getCandidate()) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
