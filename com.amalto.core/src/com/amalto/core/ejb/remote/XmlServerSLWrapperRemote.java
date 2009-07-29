 /*
 * Generated by XDoclet - Do not edit!
 * this class was prodiuced by xdoclet automagically...
 */
package com.amalto.core.ejb.remote;

import java.util.*;

/**
 * This class is remote adapter to XmlServerSLWrapper. It provides convenient way to access
 * facade session bean. Inverit from this class to provide reasonable caching and event handling capabilities.
 *
 * Remote facade for XmlServerSLWrapper.
 * @xdoclet-generated at 29-07-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */

public class XmlServerSLWrapperRemote extends Observable
{
    static XmlServerSLWrapperRemote _instance = null;
    public static XmlServerSLWrapperRemote getInstance() {
        if(_instance == null) {
	   _instance = new XmlServerSLWrapperRemote();
	}
	return _instance;
    }

  /**
   * cached remote session interface
   */
  com.amalto.core.ejb.remote.XmlServerSLWrapper _session = null;
  /**
   * return session bean remote interface
   */
   protected com.amalto.core.ejb.remote.XmlServerSLWrapper getSession() {
      try {
   	if(_session == null) {
	   _session = com.amalto.core.ejb.local.XmlServerSLWrapperUtil.getHome().create();
	}
	return _session;
      } catch(Exception ex) {
        // just catch it here and return null.
        // somebody can provide better solution
	ex.printStackTrace();
	return null;
      }
   }

   public boolean isUpAndRunning (  )
	  throws java.rmi.RemoteException
   {
        boolean retval;
       retval =  getSession().isUpAndRunning(  );

      return retval;

   }

   public java.lang.String[] getAllClusters ( java.lang.String revisionID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String[] retval;
       retval =  getSession().getAllClusters( revisionID );

      return retval;

   }

   public long deleteCluster ( java.lang.String revisionID,java.lang.String clusterName )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().deleteCluster( revisionID,clusterName );

      return retval;

   }

   public long deleteAllclusterNames ( java.lang.String revisionID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().deleteAllclusterNames( revisionID );

      return retval;

   }

   public long createCluster ( java.lang.String revisionID,java.lang.String clusterName )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().createCluster( revisionID,clusterName );

      return retval;

   }

   public long putDocumentFromFile ( java.lang.String fileName,java.lang.String uniqueID,java.lang.String clusterName,java.lang.String revisionID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().putDocumentFromFile( fileName,uniqueID,clusterName,revisionID );

      return retval;

   }

   public long putDocumentFromFile ( java.lang.String fileName,java.lang.String uniqueID,java.lang.String clusterName,java.lang.String revisionID,java.lang.String documentType )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().putDocumentFromFile( fileName,uniqueID,clusterName,revisionID,documentType );

      return retval;

   }

   public long putDocumentFromString ( java.lang.String xmlString,java.lang.String uniqueID,java.lang.String clusterName,java.lang.String revisionID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().putDocumentFromString( xmlString,uniqueID,clusterName,revisionID );

      return retval;

   }

   public long putDocumentFromString ( java.lang.String string,java.lang.String uniqueID,java.lang.String clusterName,java.lang.String revisionID,java.lang.String documentType )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().putDocumentFromString( string,uniqueID,clusterName,revisionID,documentType );

      return retval;

   }

   public long putDocumentFromDOM ( org.w3c.dom.Element root,java.lang.String uniqueID,java.lang.String clusterName,java.lang.String revisionID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().putDocumentFromDOM( root,uniqueID,clusterName,revisionID );

      return retval;

   }

   public java.lang.String getDocumentAsString ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String uniqueID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().getDocumentAsString( revisionID,clusterName,uniqueID );

      return retval;

   }

   public java.lang.String getDocumentAsString ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String uniqueID,java.lang.String encoding )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().getDocumentAsString( revisionID,clusterName,uniqueID,encoding );

      return retval;

   }

   public byte[] getDocumentBytes ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String uniqueID,java.lang.String documentType )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        byte[] retval;
       retval =  getSession().getDocumentBytes( revisionID,clusterName,uniqueID,documentType );

      return retval;

   }

   public java.lang.String[] getAllDocumentsUniqueID ( java.lang.String revisionID,java.lang.String clusterName )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String[] retval;
       retval =  getSession().getAllDocumentsUniqueID( revisionID,clusterName );

      return retval;

   }

   public long deleteDocument ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String uniqueID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().deleteDocument( revisionID,clusterName,uniqueID );

      return retval;

   }

   public long deleteDocument ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String uniqueID,java.lang.String documentType )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().deleteDocument( revisionID,clusterName,uniqueID,documentType );

      return retval;

   }

   public int deleteXtentisObjects ( java.util.HashMap objectRootElementNameToRevisionID,java.util.HashMap objectRootElementNameToClusterName,java.lang.String objectRootElementName,com.amalto.xmlserver.interfaces.IWhereItem whereItem )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        int retval;
       retval =  getSession().deleteXtentisObjects( objectRootElementNameToRevisionID,objectRootElementNameToClusterName,objectRootElementName,whereItem );

      return retval;

   }

   public int deleteItems ( java.util.LinkedHashMap conceptPatternsToRevisionID,java.util.LinkedHashMap conceptPatternsToClusterName,java.lang.String conceptName,com.amalto.xmlserver.interfaces.IWhereItem whereItem )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        int retval;
       retval =  getSession().deleteItems( conceptPatternsToRevisionID,conceptPatternsToClusterName,conceptName,whereItem );

      return retval;

   }

   public long moveDocumentById ( java.lang.String sourceRevisionID,java.lang.String sourceclusterName,java.lang.String uniqueID,java.lang.String targetRevisionID,java.lang.String targetclusterName )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().moveDocumentById( sourceRevisionID,sourceclusterName,uniqueID,targetRevisionID,targetclusterName );

      return retval;

   }

   public long countItems ( java.util.LinkedHashMap conceptPatternsToRevisionID,java.util.LinkedHashMap conceptPatternsToClusterName,java.lang.String conceptName,com.amalto.xmlserver.interfaces.IWhereItem whereItem )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().countItems( conceptPatternsToRevisionID,conceptPatternsToClusterName,conceptName,whereItem );

      return retval;

   }

   public long countXtentisObjects ( java.util.HashMap objectRootElementNameToRevisionID,java.util.HashMap objectRootElementNameToClusterName,java.lang.String mainObjectRootElementName,com.amalto.xmlserver.interfaces.IWhereItem whereItem )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        long retval;
       retval =  getSession().countXtentisObjects( objectRootElementNameToRevisionID,objectRootElementNameToClusterName,mainObjectRootElementName,whereItem );

      return retval;

   }

   public java.util.ArrayList runQuery ( java.lang.String revisionID,java.lang.String clusterName,java.lang.String query,java.lang.String[] parameters )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.ArrayList retval;
       retval =  getSession().runQuery( revisionID,clusterName,query,parameters );

      return retval;

   }

   public java.lang.String getXtentisObjectsQuery ( java.util.HashMap objectRootElementNameToRevisionID,java.util.HashMap objectRootElementNameToClusterName,java.lang.String mainObjectRootElementName,java.util.ArrayList viewableObjectElements,com.amalto.xmlserver.interfaces.IWhereItem whereItem,java.lang.String orderBy,java.lang.String direction,int start,int limit )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().getXtentisObjectsQuery( objectRootElementNameToRevisionID,objectRootElementNameToClusterName,mainObjectRootElementName,viewableObjectElements,whereItem,orderBy,direction,start,limit );

      return retval;

   }

   public java.lang.String getItemsQuery ( java.util.LinkedHashMap conceptPatternsToRevisionID,java.util.LinkedHashMap conceptPatternsToClusterName,java.lang.String forceMainPivot,java.util.ArrayList viewableFullPaths,com.amalto.xmlserver.interfaces.IWhereItem whereItem,java.lang.String orderBy,java.lang.String direction,int start,int limit,int spellThreshold )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().getItemsQuery( conceptPatternsToRevisionID,conceptPatternsToClusterName,forceMainPivot,viewableFullPaths,whereItem,orderBy,direction,start,limit,spellThreshold );

      return retval;

   }

  /**
   * override this method to provide feedback to interested objects
   * in case collections were changed.
   */
  public void invalidate() {

  	setChanged();
	notifyObservers();
  }
}
