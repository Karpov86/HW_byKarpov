package by.karpov.service;

import java.util.Date;

public class CheckDateAppointmentWithDoctorImpl implements CheckDateAppointmentWithDoctor {
    @Override
    public boolean checkDate(Date date) {
    //в параметрах нужна дата ввиде месяц/день и время час/минуты, далее открывается конкретная карта, где К это время, а V наличие "талончика"(1 - есть талон,
    //  -1 нет талона.
        return false;
    }
}
/* Может лучше создать этот метод в классе AppointmentWithDoctorImpl,
   а не создовать для него интерфейс и класс?
*/
