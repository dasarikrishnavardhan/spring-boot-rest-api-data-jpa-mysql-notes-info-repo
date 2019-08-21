/**
 * 
 */
package com.krishnadasari.notesmgmt.springbootnotesmgmtapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.dao.NotesInfoDAO;
import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.model.NotesInfo;

/**
 * @author dasari krishna vardhan
 *
 */
@Service
@Transactional
public class NotesManagementServiceImpl implements NotesManagementService 
{
	@Autowired
	private NotesInfoDAO notesInfoDAO;

	@Override
	public NotesInfo createNotes(NotesInfo notes)
	{
		return notesInfoDAO.save(notes);
	}

	@Override
	public NotesInfo updateNotes(Integer notesId,NotesInfo updatedNotes) 
	{
		NotesInfo existingNotes = notesInfoDAO.findById(notesId).get();
		if(existingNotes!=null)
		{
			existingNotes.setTitle(updatedNotes.getTitle());
			existingNotes.setContent(updatedNotes.getContent());
		}
		return notesInfoDAO.save(existingNotes);
	}

	@Override
	public NotesInfo findNotesById(Integer notesId) 
	{
		return notesInfoDAO.findById(notesId).get();
	}

	@Override
	public List<NotesInfo> getAllNotes() 
	{
		return notesInfoDAO.findAll();
	}

	@Override
	public void deleteNotes(Integer notesId) 
	{
		NotesInfo existingNotes = notesInfoDAO.findById(notesId).get();
		notesInfoDAO.delete(existingNotes);;
	}

	public NotesInfoDAO getNotesInfoDAO() {
		return notesInfoDAO;
	}

	public void setNotesInfoDAO(NotesInfoDAO notesInfoDAO) {
		this.notesInfoDAO = notesInfoDAO;
	}

}
