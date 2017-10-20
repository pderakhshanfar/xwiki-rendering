package org.xwiki.rendering.listener.chaining;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.evosuite.shaded.org.mockito.Matchers.any;
//import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.runtime.MockitoExtension.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.syntax.Syntax;

public class BlockStateChainingListenerFrame4Test {


	 @Test(timeout = 4000)
	   public void test0()  throws Throwable  {
     ListenerChain listenerChain0 = new ListenerChain();
     ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
     EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
     ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
     doReturn(consecutiveNewLineStateChainingListener0, consecutiveNewLineStateChainingListener0, emptyBlockChainingListener0, consecutiveNewLineStateChainingListener0).when(listenerChain1).getNextListener(any(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      blockStateChainingListener0.onId("A@7]E");
    HashMap<String, String> hashMap0 = new HashMap<String, String>();
     blockStateChainingListener0.endTableCell(hashMap0);
      Format format0 = Format.ITALIC;
      blockStateChainingListener0.endFormat(format0, hashMap0);
     // fail("Expecting exception: NoSuchElementException");
//      // Undeclared exception!
//      try {
//        blockStateChainingListener0.endFormat(format0, hashMap0);
//         fail("Expecting exception: NoSuchElementException");
//
//      } catch(NoSuchElementException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//        assertThrownBy("java.util.ArrayDeque", e);
//      }
	 }
}

//	@Test(timeout = 4000)
//	public void test(){
//	ListenerChain listenerChain0 = new ListenerChain();
//	EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
//	ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
//	doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(any(java.lang.Class.class));
//	EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
//	Format format0 = Format.UNDERLINED;
//	HashMap<String, String> hashMap0 = new HashMap<String, String>();
//	emptyBlockChainingListener1.endFormat(format0, hashMap0);
//	  }
