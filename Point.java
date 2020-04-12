class Point {
	String id;
	String color;
	double x,y;

	Point(String _id, String _clr, double _x, double _y) {
		id = _id;
		color = _clr;
		x = _x;
		y = _y;
	}

	void setId(String _id)
	{
		id = _id;
	}

	void setColor(String _clr)
	{
		color = _clr;
	}

	void setX(double _x)
	{
		x = _x;
	}

	void setY(double _y)
	{
		y = _y;
	}

	void getId() { return id; }
	void getColor() { return color; }
	void getX() { return x; }
	void getY() { return y; }

	public void move (char xDirection, char yDirection) {
		switch (xDirection)
		{
			case 'L': x--; break;
			case 'R': x++; break;
			default: break;
		}
		switch (yDirection)
		{
			case 'U': y++; break;
			case 'D': y--; break;
			default: break;
		}
	}

	public void draw () {
		System.out.println("(x, y): " + x ", " + y);
	}



}