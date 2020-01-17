package by.karpov.entity;

public class Clinic {


    //info about particular clinic
    //адресс, телефон, геолокация и т.д.

    //move to services
    /*public static boolean patientRegistration(Patient patient, Map<Integer, Patient> patients){

        boolean confirmation = false;
        Map<Integer, Patient> map = new HashMap<>(patients);

        if(map.put(patient.getMedicalInsurance(),patient)==null){
            patients.put(patient.getMedicalInsurance(),patient);
            confirmation = true;
        } else{
            System.out.println("Клиент с таким номером медецинской страховки уже существует.");
        }
        return confirmation;
    }*/

    public static void appointmentWithDoctor(Patient patient, Doctor doctor) {

    } //запись к доктору

    public static String diagnosis() {
        return "Some diagnose";
    }
}
