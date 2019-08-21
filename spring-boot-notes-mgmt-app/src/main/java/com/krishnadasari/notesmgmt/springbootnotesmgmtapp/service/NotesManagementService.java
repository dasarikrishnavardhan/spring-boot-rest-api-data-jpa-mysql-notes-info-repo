/**
 * 
 */
package com.krishnadasari.notesmgmt.springbootnotesmgmtapp.service;

import java.util.List;

import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.model.NotesInfo;

/**
 * @author dasari krishna vardhan
 *
 */
public interface NotesManagementService 
{
	public NotesInfo createNotes(NotesInfo notes);
	public NotesInfo updateNotes(Integer notesId,NotesInfo notes);
	public NotesInfo findNotesById(Integer notesId);
	public List<NotesInfo> getAllNotes();
	public void deleteNotes(Integer notesId);
}
