package univ.savemother.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the woman database table.
 * 
 */
@Entity
@NamedQuery(name="Woman.findAll", query="SELECT w FROM Woman w")
public class Woman implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cycledays;

	private String district;

	private String division;

	@Temporal(TemporalType.DATE)
	private Date dueDate;

	private String fullname;

	private float height;

	@Temporal(TemporalType.DATE)
	private Date lmpDate;

	private String mobile;

	private String opazila;

	private int ovulationdays;

	private String union;

	private float weight;

	//bi-directional many-to-one association to DoctorApointment
	@OneToMany(mappedBy="woman")
	private List<DoctorApointment> doctorApointments;

	public Woman() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCycledays() {
		return this.cycledays;
	}

	public void setCycledays(int cycledays) {
		this.cycledays = cycledays;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Date getLmpDate() {
		return this.lmpDate;
	}

	public void setLmpDate(Date lmpDate) {
		this.lmpDate = lmpDate;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpazila() {
		return this.opazila;
	}

	public void setOpazila(String opazila) {
		this.opazila = opazila;
	}

	public int getOvulationdays() {
		return this.ovulationdays;
	}

	public void setOvulationdays(int ovulationdays) {
		this.ovulationdays = ovulationdays;
	}

	public String getUnion() {
		return this.union;
	}

	public void setUnion(String union) {
		this.union = union;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public List<DoctorApointment> getDoctorApointments() {
		return this.doctorApointments;
	}

	public void setDoctorApointments(List<DoctorApointment> doctorApointments) {
		this.doctorApointments = doctorApointments;
	}

	public DoctorApointment addDoctorApointment(DoctorApointment doctorApointment) {
		getDoctorApointments().add(doctorApointment);
		doctorApointment.setWoman(this);

		return doctorApointment;
	}

	public DoctorApointment removeDoctorApointment(DoctorApointment doctorApointment) {
		getDoctorApointments().remove(doctorApointment);
		doctorApointment.setWoman(null);

		return doctorApointment;
	}

}