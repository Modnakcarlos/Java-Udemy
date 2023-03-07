package tratamentoDeErros.exemplo.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import tratamentoDeErros.exemplo.model.exceptions.DomainException;


public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

    public Reservation() {
        super();
    }
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

        if(!checkIn.after(checkOut)) {
            throw new IllegalArgumentException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = getCheckOut().getTime() - getCheckIn().getTime();
        
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)) {
            throw new IllegalArgumentException("Reservation dates for update must be future dates");       
        }
        else if(!checkIn.after(checkOut)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    @Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}

}
