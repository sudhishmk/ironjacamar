/*
 * IronJacamar, a Java EE Connector Architecture implementation
 * Copyright 2015, Red Hat Inc, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 1.0 as
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse
 * Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License 
 * along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.ironjacamar.core.tx.noopts;

import org.ironjacamar.core.spi.transaction.recovery.XAResourceRecovery;

import javax.transaction.xa.XAResource;

/**
 * An XAResourceRecovery implementation.
 *
 * @author <a href="jesper.pedersen@ironjacamar.org">Jesper Pedersen</a>
 */
public class XAResourceRecoveryImpl implements XAResourceRecovery
{
   /**
    * Constructor
    */
   public XAResourceRecoveryImpl()
   {
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public void initialize() throws Exception
   {
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public void shutdown() throws Exception
   {
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public XAResource[] getXAResources()
   {
      return new XAResource[0];
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public void setJndiName(String jndiName)
   {
   }
}