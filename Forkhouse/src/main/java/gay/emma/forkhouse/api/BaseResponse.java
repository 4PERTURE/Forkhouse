package gay.emma.forkhouse.api;

public class BaseResponse{
	public boolean success;
	public String errorMessage;

	@Override
	public String toString(){
		return "BaseResponse{"+
				"success="+success+
				", errorMessage='"+errorMessage+'\''+
				'}';
	}
}
