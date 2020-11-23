
import com.*;

public class Main {

    public static void main(String[] args)  {
        Train train = new Train("поезд", TrainModels.RED);
        Ticket ticket = new Ticket("билет", train.getTrainModel().getI());
        Properties[] properties_array = { Properties.UNCOMFORTABLE, Properties.HARD };
        Pillow pillow = new Pillow("подушка", properties_array);
        Cane cane = new Cane("трость", 20);
        Person person = new Person("Скуперфильд", 1000);
        if (person.BuyTicket(ticket)){
            return;
        }
        person.GetOnTheTrain(train);
        Person employee = new Employee("проводник", ticket);
        employee.CheckForTicket(person);
        PersonProperties[] passengerProperties = {PersonProperties.RUDE, PersonProperties.TACITURN};
        Person passenger = new Person("Сосед", passengerProperties);
        if (person.TryToSpeak(passenger)){
            person.Speak(passenger);
        }
        if (person.Think("Не забыл ли я свою трость в том дупле?")){
            person.GetNervous();
            employee.CalmDownSE(person);
            person.CalmDown();
            person.Sleep(pillow);
        }
        else{
            person.Sleep(pillow);
        }
    }
}
