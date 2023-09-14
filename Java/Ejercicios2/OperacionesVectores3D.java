public class OperacionesVectores3D {

	public double calculaProductoPunto(Vector3D v1, Vector3D v2) {
		double res = v1.getRefX() * v2.getRefX() + 
				     v1.getRefY() * v2.getRefY() +
				     v1.getRefZ() * v2.getRefZ();
		return res;
	}
	
	public Vector3D calculaProductoCruz(Vector3D v1, Vector3D v2) {
		double i, j ,k;
		Vector3D resVec = new Vector3D();
		i = v1.getRefY() * v2.getRefZ() - v1.getRefZ() * v2.getRefY();
		j = v1.getRefX() * v2.getRefZ() - v1.getRefZ() * v2.getRefX();
		k = v1.getRefX() * v2.getRefY() - v1.getRefY() * v2.getRefX();
		resVec.setRefX(i);
	    resVec.setRefY(j);
	    resVec.setRefZ(k);
		return resVec;
	}
}