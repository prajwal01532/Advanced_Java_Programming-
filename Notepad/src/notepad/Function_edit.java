package notepad;

public class Function_edit {
	PrajwalNotepad praz;
	
	public Function_edit(PrajwalNotepad praz) {
		this.praz=praz;
	}
	
	
	//undo ko lagi
	public void setUndo() {
		praz.um.undo();
	}
	
	
	//redoko lagi
	public void setRedo() {
		praz.um.redo();
	}
	
}

