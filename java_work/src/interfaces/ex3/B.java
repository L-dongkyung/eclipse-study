package interfaces.ex3;

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}



class B implements I4{
	public void z() {
	}
	public void x() {
		
	}

}
