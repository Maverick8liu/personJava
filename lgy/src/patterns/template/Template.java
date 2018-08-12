package patterns.template;

public class Template extends AbstractTemplate {

	@Override
	void getData() {
		// TODO Auto-generated method stub
		data = "data";
	}

	@Override
	void calcData() {
		// TODO Auto-generated method stub
		data = (String)data+data;
	}

}
