public class DoctorLauncher{
    public static void main (String[] args){
        //create an object
        Doctor doctor = new Doctor();
        FamilyDoctor familyDoctor = new FamilyDoctor();
        Surgeon surgeon = new Surgeon();

        //Initialize the 'workAtHospital' variable
        doctor.workAtHospital = true;
        familyDoctor.workAtHospital = false;
        surgeon.workAtHospital = true;

        System.out.println("Doctor works at hospital? " + doctor.workAtHospital);
        System.out.println("Family Doctor works at home? " + familyDoctor.workAtHospital);
        System.out.println("surgeon works at hospital? " + surgeon.workAtHospital);

        doctor.treatPatient();
        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}