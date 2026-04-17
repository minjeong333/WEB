package day03Prac;

import java.util.ArrayList;

public class BeautyService {

	BeautyDAO dao = new BeautyDAO();

	public ArrayList<Beauty> getBeautyListAll() {

		return dao.selectAll();

	}
}
