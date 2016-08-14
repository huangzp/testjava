package com.test.json;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class JSONClient {

	public static void main(String[] args) {
		// HttpClient client = new DefaultHttpClient();
		// HttpPost post = new HttpPost("http://localhost:8080/json");
		// JSONObject response = null;
		// try {
		// StringEntity s = new StringEntity(json.toString());
		// s.setContentEncoding("UTF-8");
		// s.setContentType("application/json");
		// post.setEntity(s);
		//
		// HttpResponse res = client.execute(post);
		// if(res.getStatusLine().getStatusCode() == HttpStatus.OK.value()){
		// HttpEntity entity = res.getEntity();
		// String charset = EntityUtils.getContentCharSet(entity);
		// response = new JSONObject(new JSONTokener(new
		// InputStreamReader(entity.getContent(),charset)));
		// }
		// } catch (Exception e) {
		// throw new RuntimeException(e);
		// }

	}

}
