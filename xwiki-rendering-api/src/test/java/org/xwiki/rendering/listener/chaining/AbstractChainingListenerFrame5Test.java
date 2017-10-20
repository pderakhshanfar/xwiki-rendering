package org.xwiki.rendering.listener.chaining;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.evosuite.shaded.org.mockito.Matchers.any;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;

import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
public class AbstractChainingListenerFrame5Test {

	@Test
	public void test() {

	      ListenerChain listenerChain0 = new ListenerChain();
	      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
	      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
	      doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(any(java.lang.Class.class));
	      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
	      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
	      doReturn(blockStateChainingListener0).when(listenerChain2).getNextListener(any(java.lang.Class.class));
	      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain2);
	      ListenerChain listenerChain3 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
	      doReturn(emptyBlockChainingListener1).when(listenerChain3).getNextListener(any(java.lang.Class.class));
	      HashMap<String, String> hashMap0 = new HashMap<String, String>();
	      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain3);
	      Format format0 = Format.UNDERLINED;
	      consecutiveNewLineStateChainingListener0.endFormat(format0, hashMap0);
//	      // Undeclared exception!
//	      try {
//	        consecutiveNewLineStateChainingListener0.endFormat(format0, hashMap0);
//	        fail("Expecting exception: NoSuchElementException");
//
//	      } catch(NoSuchElementException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	         assertThrownBy("java.util.ArrayDeque", e);
//	      }

	}

}
