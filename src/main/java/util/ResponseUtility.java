package util;

import org.json.JSONException;
import org.json.JSONObject;

public class ResponseUtility {

	private ResponseUtility() {
		// TODO Auto-generated constructor stub
	}

	public static String getResponse(String mess) {
		JSONObject result = new JSONObject();
		try {
			result.put("message", mess);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result.toString();
	}
}
