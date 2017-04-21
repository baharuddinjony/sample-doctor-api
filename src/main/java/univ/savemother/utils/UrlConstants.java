package univ.savemother.utils;

public class UrlConstants {
	private UrlConstants(){
		
	}
	public static final String VERSION = "/v1";
	public static final String DOCTOR = VERSION+"/doctor";
	public static final String DOCTOR_ID = VERSION+DOCTOR+"/{id}";
	public static final String WOMAN = VERSION+"/woman";
	public static final String APOINTMENT = VERSION+"/apointment";
}
