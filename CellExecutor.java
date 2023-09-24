class CellExecutor{
	
	public static void main(String time[]){
		Cell cell=new Cell();
		cell.setCellId(1);
		cell.setCellName("Button Cell");
		cell.setVoltage(1.5);
		
		Watch watch=new Watch();
		watch.cell=cell;
		watch.watchName="Titan";
		
		System.out.println("Cell id : "+watch.cell.getCellId());
		System.out.println("Cell Name : "+watch.cell.getCellName());
		System.out.println("Cell voltage : "+watch.cell.getVoltage());
		System.out.println("Watch Name : "+watch.watchName);
		
	}
}
