/**
 * 
 */
package com.krishnadasari.notesmgmt.springbootnotesmgmtapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.model.NotesInfo;
import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.service.NotesManagementService;

/**
 * @author dasari krishna vardhan
 *
 */
@RestController
@RequestMapping(path = "/notes")
public class NotesResource 
{
	@Autowired
	private  NotesManagementService notesManagementService;
	
	
	@PostMapping
	public NotesInfo createNotesInfo(@RequestBody NotesInfo notes)
	{
		return notesManagementService.createNotes(notes);
	}
	
	@GetMapping
	public List<NotesInfo> getAllNotes()
	{
		return notesManagementService.getAllNotes();
	}
	
	@GetMapping(path = "/{notesId}")
	public NotesInfo getNotesById(@PathVariable("notesId") Integer notesId)
	{
		return notesManagementService.findNotesById(notesId);
		
	}
	
	@PutMapping(path = "/{notesId}")
	public NotesInfo updateNotes(@PathVariable("notesId") Integer notesId,@RequestBody NotesInfo notes)
	{
		return notesManagementService.updateNotes(notesId, notes);
		
	}
	
	@DeleteMapping(path = "/{notesId}")
	public String removeNotes(@PathVariable("notesId") Integer notesId)
	{
		 notesManagementService.deleteNotes(notesId);
		 
		 return "Notes with Id : "+notesId+" Deleted Sucessfully";
		
	}

	public NotesManagementService getNotesManagementService() {
		return notesManagementService;
	}

	public void setNotesManagementService(NotesManagementService notesManagementService) {
		this.notesManagementService = notesManagementService;
	}
}
