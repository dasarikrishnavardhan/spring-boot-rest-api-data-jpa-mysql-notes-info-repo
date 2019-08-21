/**
 * 
 */
package com.krishnadasari.notesmgmt.springbootnotesmgmtapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishnadasari.notesmgmt.springbootnotesmgmtapp.model.NotesInfo;

/**
 * @author dasari krishna vardhan
 *
 */
@Repository
public interface NotesInfoDAO extends JpaRepository<NotesInfo,Integer> 
{

}
