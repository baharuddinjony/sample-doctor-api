package univ.savemother.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the doctor_apointment database table.
 * 
 */
@Entity
@Table(name="doctor_apointment")
@NamedQuery(name="DoctorApointment.findAll", query="SELECT d FROM DoctorApointment d")
public class DoctorApointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date apointmentDate;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="doctorId")
	private Doctor doctor;

	//bi-directional many-to-one association to Woman
	@ManyToOne
	@JoinColumn(name="patientId")
	private Woman woman;

	public DoctorApointment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getApointmentDate() {
		return this.apointmentDate;
	}

	public void setApointmentDate(Date apointmentDate) {
		this.apointmentDate = apointmentDate;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Woman getWoman() {
		return this.woman;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}

}