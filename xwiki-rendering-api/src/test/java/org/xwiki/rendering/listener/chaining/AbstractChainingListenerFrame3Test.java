// This test is automatically generated  by EvoCrash for issue XRENDERING-422.
// bug report: https://jira.xwiki.org/browse/XRENDERING-422
// target Frame : 5
// target class: AbstractChainingListener
// target method: endformat()
// version: 7.3

package org.xwiki.rendering.listener.chaining;

 import org.junit.Test;
 import static org.junit.Assert.*;
 import static org.evosuite.shaded.org.mockito.Mockito.*;
 import static org.evosuite.runtime.MockitoExtension.doReturn;
 import static org.evosuite.runtime.EvoAssertions.*;
 import java.util.HashMap;
 import java.util.NoSuchElementException;
 import org.evosuite.runtime.ViolatedAssumptionAnswer;
 import org.xwiki.rendering.listener.Format;
 import org.xwiki.rendering.listener.MetaData;
 import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
 import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
 import org.xwiki.rendering.listener.chaining.ListenerChain;
 import org.xwiki.rendering.listener.chaining.MetaDataStateChainingListener;
 import org.xwiki.rendering.listener.reference.ResourceReference;
 import org.xwiki.rendering.listener.reference.ResourceType;

public class AbstractChainingListenerFrame3Test
{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
       ListenerChain listenerChain0 = new ListenerChain();
       ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
       EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
       ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
       doReturn(consecutiveNewLineStateChainingListener0, consecutiveNewLineStateChainingListener0, consecutiveNewLineStateChainingListener0, consecutiveNewLineStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(any(java.lang.Class.class));
       MetaDataStateChainingListener metaDataStateChainingListener0 = new MetaDataStateChainingListener(listenerChain1);
       HashMap<String, String> hashMap0 = new HashMap<String, String>();
       metaDataStateChainingListener0.endTableCell(hashMap0);
       MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
       metaDataStateChainingListener0.beginDocument(metaData0);
       ResourceType resourceType0 = ResourceType.INTERWIKI;
       ResourceReference resourceReference0 = new ResourceReference("", resourceType0);
       metaDataStateChainingListener0.endLink(resourceReference0, true, hashMap0);
       MetaData metaData1 = mock(MetaData.class, new ViolatedAssumptionAnswer());
       metaDataStateChainingListener0.beginDocument(metaData1);
       Format format0 = Format.SUBSCRIPT;
       metaDataStateChainingListener0.endFormat(format0, hashMap0);
   }

}
