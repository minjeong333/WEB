package 학생.김민정;

import java.util.ArrayList;
import java.util.Random;

public class 랜덤한이미지Service {
	public String getImgs() {
		ArrayList<String> imgList = new ArrayList<>();

		imgList.add("<img src=\"/day2Prac/imgs/고양이.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/아기소.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/펭귄.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/호랑이.jpg\">");

		Random random = new Random();
		int RandomIndex = random.nextInt(imgList.size());
		return imgList.get(RandomIndex);
	}
}
