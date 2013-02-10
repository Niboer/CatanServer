
public class Ressource {
	private int menge;
	
	public int get_menge()
	{
		return menge;
	}
	
	public boolean set_menge(int menge)
	{
		if (menge >= 0)
		{
			this.menge = menge;
			return true;
		}
		else
		{
			return false;
		}
		
	}
}