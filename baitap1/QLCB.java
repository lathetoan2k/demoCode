package baitap1;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
	protected List<CanBo> canBos;

	public QLCB() {
		this.canBos = new ArrayList<>();
	}

	public void themCanBo(CanBo canBo) {
		this.canBos.add(canBo);
	}

	public void showThongTin() {
		this.canBos.forEach(CanBo -> System.out.println(CanBo));
		;
	}

}
