
package Model;
import javax.persistence.*;

@Entity
@Table(name="schedule")
public class schedule {
    @Id
    String busno;
     String pickup;
  String dropto;
  String via;
  String time;

   

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropto() {
        return dropto;
    }

    public void setDropto(String dropto) {
        this.dropto = dropto;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }
     public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
 