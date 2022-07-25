package game.objects;

public class GameObject {
		
	private int id;
	private String name;
	
	private int[][] comparison = {
			//				   가위		바위		보
			/* 가위 */ 		{	 0,		-1,		 1		},
			/* 바위 */		{	 1,		 0,		-1		},
			/* 보 */ 		{	-1,		 1,		 0		},
	};
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	// 이겼을 때 1, 졌을 때 -1, 비김 0으로 리턴
	public int compareTo(GameObject ob) {
		return comparison[id][ob.id]; // 내각체 id와 다른객체 id를 비교
	}

}
