

		class GrandParent{
			String name;
			public GrandParent(String name) {
			this.name = name;
			}
			}
			class Parent extends GrandParent{
			public Parent(String name) {
			super(name);
			}
			}
			class Child extends Parent{
			String name;
			public Child(String name) {
			super(name);
			this.name = name;
			}
			}
			class Sample4{
			public static void main(String[] args) {
			Child child = new Child("Charles");
			System.out.println(child.name);
			}
			}





	


