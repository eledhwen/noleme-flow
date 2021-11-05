package com.noleme.flow;

import com.noleme.flow.node.Node;

/**
 * Concept representing a {@link Node} with a potential upstream.
 * It features an "input" of type I.
 *
 * FlowIn nodes include {@link Pipe}, {@link Sink}, {@link com.noleme.flow.stream.StreamGenerator} and {@link com.noleme.flow.stream.StreamIn} subtypes.
 *
 * @author Pierre Lecerf (plecerf@lumiomedical.com)
 * Created on 2020/03/01
 */
public interface FlowIn<I> extends Node
{

}
