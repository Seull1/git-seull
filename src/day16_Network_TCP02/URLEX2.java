package day16_Network_TCP02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEX2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&ei=uKh2ZerWAafN1e8PnemK-A4&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=kim+y&gs_lp=Egxnd3Mtd2l6LXNlcnAiBWtpbSB5KgIIADIKEC4YgAQYigUYQzIFEC4YgAQyBRAuGIAEMgUQLhiABDIFEC4YgAQyBRAuGIAEMgUQABiABDIFEC4YgAQyBRAuGIAEMgUQLhiABDIZEC4YgAQYigUYQxiXBRjcBBjeBBjfBNgBA0idRFDhEViKM3AGeAGQAQCYAZcBoAGkB6oBAzAuOLgBAcgBAPgBAagCFMICChAAGEcY1gQYsAPCAiAQABiABBiKBRjlAhjlAhjqAhi0AhiKAxi3AxjUA9gBAcICEBAAGAMYjwEY6gIYtALYAQLCAgsQABiABBixAxiDAcICBBAAGAPCAg0QLhiABBjHARjRAxgKwgIREC4YgAQYsQMYgwEYxwEY0QPCAiAQLhiABBixAxiDARjHARjRAxiXBRjcBBjeBBjgBNgBA8ICCBAAGIAEGLEDwgILEC4YgAQYsQMYgwHCAhQQLhiABBiXBRjcBBjeBBjgBNgBA8ICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQPCAggQLhixAxiABOIDBBgAIEGIBgGQBgq6BgQIARgHugYGCAIQARgKugYGCAMQARgU&sclient=gws-wiz-serp");
		
//		https://www.google.com/
//		search?
//	    q=kim+yuna
//	    &sca_esv=589698990
//	    &ei=uKh2ZerWAafN1e8PnemK-A4&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=kim+y&gs_lp=Egxnd3Mtd2l6LXNlcnAiBWtpbSB5KgIIADIKEC4YgAQYigUYQzIFEC4YgAQyBRAuGIAEMgUQLhiABDIFEC4YgAQyBRAuGIAEMgUQABiABDIFEC4YgAQyBRAuGIAEMgUQLhiABDIZEC4YgAQYigUYQxiXBRjcBBjeBBjfBNgBA0idRFDhEViKM3AGeAGQAQCYAZcBoAGkB6oBAzAuOLgBAcgBAPgBAagCFMICChAAGEcY1gQYsAPCAiAQABiABBiKBRjlAhjlAhjqAhi0AhiKAxi3AxjUA9gBAcICEBAAGAMYjwEY6gIYtALYAQLCAgsQABiABBixAxiDAcICBBAAGAPCAg0QLhiABBjHARjRAxgKwgIREC4YgAQYsQMYgwEYxwEY0QPCAiAQLhiABBixAxiDARjHARjRAxiXBRjcBBjeBBjgBNgBA8ICCBAAGIAEGLEDwgILEC4YgAQYsQMYgwHCAhQQLhiABBiXBRjcBBjeBBjgBNgBA8ICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQPCAggQLhixAxiABOIDBBgAIEGIBgGQBgq6BgQIARgHugYGCAIQARgKugYGCAMQARgU&sclient=gws-wiz-serp
		
		//url 이 갖고 있는 함수 사용
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호슽트와 포트 : "+url.getAuthority());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("경로 : "+url.getPath());
		System.out.println("질의 : "+url.getQuery());
		System.out.println("파일명 : "+url.getFile());
		System.out.println("참조 : "+url.getRef());
		
		}
	
	}


