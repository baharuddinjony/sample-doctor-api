package univ.savemother.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String city;

	private String doctorName;

	private String experience;

	private String gender;

	private String hospitalName;

	private String hospitalNumber;

	private String mobile;

	private String specialization;

	//bi-directional many-to-one association to DoctorApointment
	@OneToMany(mappedBy="doctor")
	private List<DoctorApointment> doctorApointments;

	public Doctor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalNumber() {
		return this.hospitalNumber;
	}

	public void setHospitalNumber(String hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<DoctorApointment> getDoctorApointments() {
		return this.doctorApointments;
	}

	public void setDoctorApointments(List<DoctorApointment> doctorApointments) {
		this.doctorApointments = doctorApointments;
	}

	public DoctorApointment addDoctorApointment(DoctorApointment doctorApointment) {
		getDoctorApointments().add(doctorApointment);
		doctorApointment.setDoctor(this);

		return doctorApointment;
	}

	public DoctorApointment removeDoctorApointment(DoctorApointment doctorApointment) {
		getDoctorApointments().remove(doctorApointment);
		doctorApointment.setDoctor(null);

		return doctorApointment;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", city=" + city + ", doctorName=" + doctorName + ", experience=" + experience
				+ ", gender=" + gender + ", hospitalName=" + hospitalName + ", hospitalNumber=" + hospitalNumber
				+ ", mobile=" + mobile + ", specialization=" + specialization + ", doctorApointments="
				+ doctorApointments + "]";
	}

}